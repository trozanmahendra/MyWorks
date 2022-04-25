<%@ taglib uri="/WEB-INF/nested.tld" prefix="mytags"%>
<mytags:if condition='<%=10 == 20%>'>
	<mytags:true>
		<h1>CONDITION IS TRUE</h1>
	</mytags:true>
	<mytags:false>
		<h1>CONDITION IS FALSE</h1>
	</mytags:false>
</mytags:if>