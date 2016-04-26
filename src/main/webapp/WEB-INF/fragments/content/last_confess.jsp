<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="portlet light bg-inverse" style="background-color: white">
	<div class="portlet-title">
		<div class="caption caption-md">
			<i class="icon-bar-chart theme-font hide"></i> <span class="caption-subject theme-font bold">en son itiraflar</span>
			<span class="caption-helper">13 tane güncellendi</span>
		</div>
		<div class="inputs">
			<div class="portlet-input input-inline input-small ">
				<div class="input-icon right">
					<i class="icon-magnifier"></i> <input class="form-control form-control-solid" placeholder="ara..." type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="portlet-body">
		<div class="general-item-list">

			<c:forEach items="${confessions}" var="confess" varStatus="i">
				<div class=item id="${confess.id}">
					<div class=item-head>
						<div class=item-details>
							<img class=item-pic src=resources/theme/assets/admin/layout3/img/avatar4.jpg><a href=class=item-name
								primary-link>${confess.nickname}</a> <span class=item-label>${confess.university}</span>
						</div>
						<span class=item-status><span class=badge badge-empty badge-success></span> Open</span>
					</div>
					<div class=item-body>${confess.content}</div>
				</div>
			</c:forEach>

		</div>
	</div>
</div>