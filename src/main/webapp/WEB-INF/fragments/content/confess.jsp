<%@ page contentType="text/html; charset=UTF-8"%>

<div class="portlet light ">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-comments-o font-green-sharp"></i> <span class="caption-subject font-green-sharp bold">itiraf
				et!</span>
		</div>
	</div>
	<div class="portlet-body form">
		<form name="confess_form" novalidate="novalidate" role="form" action="" method="POST" id="confess_form1">
			<div class="form-body">
				<div class="alert alert-danger display-hide">
					<button class="close" data-close="alert"></button>
					Lütfen gerekli alanları doldurunuz.
				</div>
				<div class="alert alert-success display-hide">
					<button class="close" data-close="alert"></button>
					Kaydediliyor,lütfen bekleyin.
				</div>

				<div class="form-group ">
					<div class="input-icon margin-top-10">
						<i class="fa fa-user"></i> <input class="form-control" name="nickname" placeholder="rumuz" type="text">
					</div>
				</div>
				<div class="form-group ">
					<div class="input-icon margin-top-10">
						<i class="fa fa-envelope"></i> <input class="form-control" name="mail" placeholder="e-posta (opsiyonel)"
							type="text">
					</div>
				</div>
				<div class="form-group ">
					<div class="input-icon margin-top-10 ">
						<i class="fa fa-university"></i> <select name="university" class="form-control" style="color: #AAA;">
							<?= fillUniversityName(); ?>
						</select>
					</div>
				</div>
				<div class="form-group ">
					<div class="input-icon margin-top-10">
						<i class="fa fa-tag"></i> <input class="form-control" name="header" placeholder="başlık" type="text">
					</div>
				</div>
				<div class="form-group ">
					<div class="input-icon margin-top-10">
						<i class="fa fa-edit"></i>
						<textarea name="content" id="" rows="3" class="form-control" style="color: #AAA;"></textarea>
					</div>
				</div>
			</div>
	</div>
	<div class="form-actions right">
		<button type="submit" class="btn default" id="write-button">yaz</button>
		<button type="reset" class="btn green">iptal</button>
	</div>
	</form>
</div>
</div>