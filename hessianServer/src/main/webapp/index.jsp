<%@ page import="com.caucho.hessian.client.HessianProxyFactory" %>
<%@ page import="com.feiyang.hessian.service.BasicAPI" %>
<%@page language="java" pageEncoding="UTF-8" %>
<%

    HessianProxyFactory factory = new HessianProxyFactory();
    String url = "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/hello";


    BasicAPI basicAPI = (BasicAPI) factory.create(BasicAPI.class, url);

%>
<html>
    <body>
        <h2><%=url %></h2>
        <h2><%=basicAPI.hello() %></h2>
        <h2><%=basicAPI.getUser().getUserName() %></h2>
        <h2><%=basicAPI.getUser().getPassword() %></h2>
    </body>
</html>
