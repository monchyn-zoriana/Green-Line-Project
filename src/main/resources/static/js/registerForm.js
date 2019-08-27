$("#registerBtn").click(function () {

    var user = {
        email: $("#user-email").val(),
        password: $("#user-pass").val()

    }

    console.log(user);

    $.ajax({
        url: "/register",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(user),
        success: function (user) {

            localStorage.setItem('currentUser', user.email);
            window.open("/catalog-auto", "_self");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$("#welcomeField").text(localStorage.getItem('currentUser'));