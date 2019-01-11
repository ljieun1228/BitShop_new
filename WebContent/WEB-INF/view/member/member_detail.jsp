<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "domain.MemberBean" %>
<div id = "member_detail">
<%

MemberBean user = (MemberBean)session.getAttribute("user");//세션에서 가져옴
%>
<table>
	<tr>
		<th>\</th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%= user.getId() %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><%= user.getPass() %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%= user.getName() %></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%= user.getSsn() %></td>
	</tr>
</table>
마이페이지
</div>