<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "domain.MemberBean" %>
<div id = "member-detail">
<%
MemberBean member = (MemberBean)request.getAttribute("member");
%>
<table>
	<tr>
		<th>\</th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%= member.getId() %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><%= member.getPass() %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%= member.getName() %></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%= member.getSsn() %></td>
	</tr>
</table>
마이페이지
</div>