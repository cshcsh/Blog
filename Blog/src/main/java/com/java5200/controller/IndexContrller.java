package com.java5200.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java5200.entity.Blog;
import com.java5200.entity.PageBean;
import com.java5200.service.BlogService;
import com.java5200.util.PageUtil;
import com.java5200.util.StringUtil;

/**
 * ��ҳContrller��
 * @author CSH
 * @date 2018��6��3������2:03:21
 */
@Controller
@RequestMapping("/")
public class IndexContrller {

	@Resource
	private BlogService blogService;
	
	/**
	 * ������ҳ
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request)throws Exception{
		ModelAndView mav=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),6);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("typeId", typeId);
		map.put("releaseDateStr", releaseDateStr);
		List<Blog> blogList=blogService.list(map);
		for(Blog blog:blogList){
			List<String> imageList=blog.getImageList();
			String blogInfo=blog.getContent();
			Document doc=Jsoup.parse(blogInfo);
			Elements jpgs=doc.select("img[src$=.jpg]");
			for(int i=0;i<jpgs.size();i++){
				Element jpg=jpgs.get(i);
				imageList.add(jpg.toString());
				if(i==2){
					break;
				}
			}
		}
		mav.addObject("blogList", blogList);
		StringBuffer param=new StringBuffer();
		if(StringUtil.isNotEmpty(typeId)){
			param.append("typeId="+typeId+"&");
		}
		if(StringUtil.isNotEmpty(releaseDateStr)){
			param.append("releaseDateStr="+releaseDateStr+"&");
		}
		mav.addObject("pageCode", PageUtil.genPagination(request.getContextPath()+"/index.html", blogService.getTotal(map), Integer.parseInt(page), 5, param.toString()));
		mav.addObject("pageTitle", "java����ϵͳ");
		mav.addObject("mainPage", "foreground/blog/list.jsp");
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * Դ������
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/download")
	public ModelAndView download()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("pageTitle", "��վԴ������ҳ��_java����ϵͳ");
		mav.addObject("mainPage", "foreground/system/download.jsp");
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * ������Ϣ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/blogInfo")
	public ModelAndView blogInfo()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("pageTitle", "������Ϣҳ��_java����ϵͳ");
		mav.addObject("mainPage", "foreground/system/blogInfo.jsp");
		mav.setViewName("mainTemp");
		return mav;
	}
}
