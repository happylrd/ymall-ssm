<html>
<body>
<h2>Hello World!</h2>

<!-- just for test -->
<h4>spring mvc upload file</h4>
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="Upload File">
</form>

<h4>富文本图片上传</h4>
<form name="form2" action="/manage/product/rich_text_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="Upload RichTextImg">
</form>

</body>
</html>
