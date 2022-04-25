<%@ taglib uri="/WEB-INF/sql_editor.tld" prefix="db"%>
<jsp:declaration>
String query;
</jsp:declaration>
<jsp:scriptlet>
query = request.getParameter("query");
</jsp:scriptlet>
<db:execute>
	<jsp:expression>query</jsp:expression>
</db:execute>