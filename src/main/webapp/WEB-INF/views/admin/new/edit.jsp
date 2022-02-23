<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
<title>Chỉnh sửa bài viết</title>
</head>
<body>
<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">Home</a>
							</li>

							<li>
								<a href="#">Forms</a>
							</li>
							<li class="active">Form Elements</li>
						</ul><!-- /.breadcrumb -->
					</div>
					
					<div class="page-content">
						<div class="row">
							<div class="col-xs-12">
								<form class="form-horizontal" role="form">
										<div class="form-group">
											  <label for="categoryCode">Thể loại:</label>
											  <select class="form-control" id="categoryCode" name="categoryCode">
											    <option value="">1</option>
											    <option>2</option>
											    <option>3</option>
											    <option>4</option>
											  </select>
										</div>
										<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Tên bài viết </label>

										<div class="col-sm-9">
											<input type="text" id="form-field-1" class="col-xs-10 col-sm-5" id="title" name="title" />
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Ảnh đại diện </label>

										<div class="col-sm-9">
											<input type="file" id="form-field-1" class="col-xs-10 col-sm-5" id="thumbnail" name="thumbnail" />
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
		</div>
		</div>
</body>
</html>
