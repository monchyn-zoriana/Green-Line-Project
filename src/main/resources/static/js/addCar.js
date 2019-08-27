function addInfo(object) {

    var notBaseUploadedFile = object.files[0];
    var reader = new FileReader();
    reader.readAsDataURL(uploadedFile);
    reader.onload = function () {

        var base64file = reader.result;


        var car = {
            id: '1',
            image: base64file
        }

        $.ajax({
            url: "/gallery/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(car),
            success: function (data) {
                alert("+");
            },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });


    }
}