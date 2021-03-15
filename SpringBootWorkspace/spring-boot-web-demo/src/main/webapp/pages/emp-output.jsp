<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
	<section style="min-height:400px;">
		<h2>Employee Details</h2>
		
 		<c:choose>
 			<c:when test="emp eq null">
 				<p><strong>No data to display</strong>
 			</c:when>
 			<c:otherwise>
 				<table>
 					<tr>
 						<td><em>Employee Id</em></td>
 						<td>${emp.empId }</td>
 					</tr>
 					<tr>
 						<td><em>Employee Name</em></td>
 						<td>${emp.name }</td>
 					</tr>
 					<tr>
 						<td><em>Designation</em></td>
 						<td>${emp.designation }</td>
 					</tr>
 					<tr>
 						<td><em>Basic</em></td>
 						<td>${emp.basic }</td>
 					</tr>
 					<tr>
 						<td><em>HRA</em></td>
 						<td>${emp.hra }</td>
 					</tr>
 					<tr>
 						<td><em>TA</em></td>
 						<td>${emp.ta }</td>
 					</tr>
					 					
 				</table>
 			</c:otherwise>
 		</c:choose> 
	</section>
<jsp:include page="/footer" />