<%--
  Created by IntelliJ IDEA.
  User: Aleksandr V.
  Date: 07.04.2022
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Calendar"%>
<%@ taglib prefix="tag" uri="http://www.adehermawan.com/dateFormatter"%>
<header class="mdl-layout_header">
    <div class="mdl-layout_header-row">
        <!-- Title -->
        <span class="mdl-layout-title">Personal Stuff Management System</span>
        <!-- Add spacer, to align navigation to the right -->
        <div class="mdl-layout-spacer"></div>
        <!-- Navigation. We hide it in small screens. -->
        <tag:formatDate date="<%=Calendar.getInstance().getTime()%>"
                        format="dd-MM-YYYY hh:mm"></tag:formatDate>
        <nav class="mdl-navigation mdl-layout--large-screen-only">
            <a class="mdl-navigation__link" href="/WebPGhw/new">Add New Stuff</a>
            <a class="mdl-navigation__link" href="/WebPGhw/list">List All Stuff</a>
        </nav>
    </div>
</header>
<div class="mdl-layout__drawer">
    <span class="mdl-layout-title">WebPShw</span>
    <nav class="mdl-navigation">
        a class="mdl-navigation__link" href="/WebPGhw/new">Add New Stuff</a>
        <a class="mdl-navigation__link" href="/WebPGhw/list">List All Stuff</a>
    </nav>
</div>
