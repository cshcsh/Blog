<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="data_list">
	<div class="data_list_title">
		<img
			src="${pageContext.request.contextPath}/static/images/weixing_icon.png" />联系博主
	</div>
	<div style="text-align: center">
		<img height=180px width=180px
			src="${pageContext.request.contextPath}/static/userImages/wx.jpg" />
	</div>
</div>

<div class="data_list">
	<div class="data_list_title">
		<img
			src="${pageContext.request.contextPath}/static/images/user_icon.png" />
		博主信息
	</div>
	<div style="text-align: center;">
		<img height=168px width=168px
			src="${pageContext.request.contextPath}/static/userImages/${blogger.imageName }" />
	</div>
	<div class="nickName">${blogger.nickName }</div>
	<div class="userSign">${blogger.sign }</div>
</div>

<div class="data_list">
	<div class="data_list_title">
		<img
			src="${pageContext.request.contextPath}/static/images/byType_icon.png" />
		按博客类别
	</div>
	<div class="datas">
		<ul>
			<c:forEach var="blogTypeCount" items="${blogTypeCountList }">
				<li><span><a href="${pageContext.request.contextPath}/index.html?typeId=${blogTypeCount.id}">${blogTypeCount.typeName }(${blogTypeCount.blogCount })</a></span></li>
			</c:forEach>

		</ul>
	</div>
</div>



<div class="data_list">
	<div class="data_list_title">
		<img
			src="${pageContext.request.contextPath}/static/images/byDate_icon.png" />
		按博客日期
	</div>
	<div class="datas">
		<ul>
			<c:forEach var="blogCount" items="${blogCountList }">
				<li><span><a href="${pageContext.request.contextPath}/index.html?releaseDateStr=${blogCount.releaseDateStr}">${blogCount.releaseDateStr }(${blogCount.blogCount })</a></span></li>
			</c:forEach>


		</ul>
	</div>
</div>

<div class="data_list">
	<div class="data_list_title">
		<img
			src="${pageContext.request.contextPath}/static/images/link_icon.png" />
		友情链接
	</div>
	<div class="datas">
		<ul>
			<c:forEach var="link" items="${linkList }">
				<li><span><a href="${link.linkUrl}" target="_blank">${link.linkName }</a></span></li>
			</c:forEach>
		</ul>
	</div>

</div>