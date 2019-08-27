$("#logo").click(function () {

    window.open('/home', "_self");

});

$("#btnHome").click(function () {

    window.open('/home', "_self");

});

$("#btnAllCar").click(function () {

    window.open('/catalog-auto', "_self");

});

$("#btnPaymentAndDelivery").click(function () {

    window.open('/payment-and-delivery', "_self");

});
$("#btnContact").click(function () {

    window.open('/contacts', "_self");

});


$("#saveBtnBrand").click(function () {

    var brandToSave = {
        brand: $("#brandId").val()
    }

    $.ajax({
        url: "/brand",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(brandToSave),
        success: function (data) {
            alert("Brand with name : " + data.brand + " was saved!");
            $("#listOfAllBrands").append("<tr><td>" + data.id +
                "</td><td>" + data.brand + "</td><td><button type='button' name='"
                + data.id +
                "' class='deleteBtn'>DELETE</button></td><td><button type='button' " +
                "name='" + data.id + "' class='updateBtn'>UPDATE</button></td></tr>");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});
$(document).ready(function () {
    $.ajax({
        url: "/brands",
        type: "GET",
        contentType: "application/json",
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
                $("#listOfAllBrands").append("<tr>" + data[i].id + "'><td>" + data[i].id +
                    "</td><td>" + data[i].brand + "</td><td><button type='button' class='deleteBtn' name='"
                    + data[i].id +
                    "' >DELETE</button></td><td><button type='button' name='"
                    + data[i].id +
                    "' class='updateBtn'>UPDATE</button></td></tr>");
            }

            $("#welcomeField").text(localStorage.getItem('currentUser'));
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$(document).on('click', 'button.deleteBtn', function () {
    var currentClickedButton = this;
    var idToDelete = currentClickedButton.name;
    console.log(this.name);
    $.ajax({
        url: "/brand/" + idToDelete,
        type: "DELETE",
        contentType: "application/json",
        success: function (user) {
            alert("delete");
            $(this).closest('tr').remove();

        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

var Ident;


$(document).on('click', 'button.updateBtn', function () {
    $("#myModal").modal('show');
    Ident = this.name;
});
$('#doUpdate').click(function () {

    var brandToUpdate = {
        id: Ident,
        brand: $("#updateValue1").val(),
    }

    $.ajax({
        url: "/brand",
        type: "PUT",
        contentType: "application/json",
        data: JSON.stringify(brandToUpdate),
        success: function (data) {
            alert("update");
            $("#myModal").modal('hide');


        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});


$("#saveBtnRegion").click(function () {

    var regionToSave = {
        region: $("#regionId").val()
    }

    $.ajax({
        url: "/region",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(regionToSave),
        success: function (data) {
            alert("Region with name : " + data.region + " was saved!");
            $("#listOfAllRegions").append("<tr><td>" + data.id +
                "</td><td>" + data.region + "</td><td><button type='button' name='"
                + data.id +
                "' class='deleteBtnRegion'>DELETE</button></td><td><button type='button' " +
                "name='" + data.id + "' class='updateBtnRegion'>UPDATE</button></td></tr>");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});
$(document).ready(function () {
    $.ajax({
        url: "/regions",
        type: "GET",
        contentType: "application/json",
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
                $("#listOfAllRegions").append("<tr>" + data[i].id + "'><td>" + data[i].id +
                    "</td><td>" + data[i].region + "</td><td><button type='button' class='deleteBtnRegion' name='"
                    + data[i].id +
                    "' >DELETE</button></td><td><button type='button' name='"
                    + data[i].id +
                    "' class='updateBtnRegion'>UPDATE</button></td></tr>");
            }

            $("#welcomeField").text(localStorage.getItem('currentUser'));
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$(document).on('click', 'button.deleteBtnRegion', function () {
    var currentClickedButton = this;
    var idToDelete = currentClickedButton.name;
    console.log(this.name);
    $.ajax({
        url: "/region/" + idToDelete,
        type: "DELETE",
        contentType: "application/json",
        success: function (user) {
            alert("delete");
            $(this).closest('tr').remove();

        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

var Ident;


$(document).on('click', 'button.updateBtnRegion', function () {
    $("#myModalRegion").modal('show');
    Ident = this.name;
});
$('#doUpdateRegion').click(function () {

    var regionToUpdate = {
        id: Ident,
        region: $("#updateValueRegion").val(),
    }

    $.ajax({
        url: "/region",
        type: "PUT",
        contentType: "application/json",
        data: JSON.stringify(regionToUpdate),
        success: function (data) {
            alert("update");
            $("#myModalRegion").modal('hide');


        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});


$("#saveBtnCondition").click(function () {

    var conditionToSave = {
        conditionCar: $("#conditionId").val()
    }

    $.ajax({
        url: "/condition",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(conditionToSave),
        success: function (data) {
            alert("Condition with name : " + data.conditionCar + " was saved!");
            $("#listOfAllConditions").append("<tr><td>" + data.id +
                "</td><td>" + data.conditionCar + "</td><td><button type='button' name='"
                + data.id +
                "' class='deleteBtnCondition'>DELETE</button></td><td><button type='button' " +
                "name='" + data.id + "' class='updateBtnCondition'>UPDATE</button></td></tr>");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});
$(document).ready(function () {
    $.ajax({
        url: "/conditions",
        type: "GET",
        contentType: "application/json",
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
                $("#listOfAllConditions").append("<tr>" + data[i].id + "'><td>" + data[i].id +
                    "</td><td>" + data[i].conditionCar + "</td><td><button type='button' class='deleteBtnCondition' name='"
                    + data[i].id +
                    "' >DELETE</button></td><td><button type='button' name='"
                    + data[i].id +
                    "' class='updateBtnCondition'>UPDATE</button></td></tr>");
            }

            $("#welcomeField").text(localStorage.getItem('currentUser'));
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$(document).on('click', 'button.deleteBtnCondition', function () {
    var currentClickedButton = this;
    var idToDelete = currentClickedButton.name;
    console.log(this.name);
    $.ajax({
        url: "/condition/" + idToDelete,
        type: "DELETE",
        contentType: "application/json",
        success: function (user) {
            alert("delete");
            $(this).closest('tr').remove();

        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

var Ident;


$(document).on('click', 'button.updateBtnCondition', function () {
    $("#myModalCondition").modal('show');
    Ident = this.name;
});
$('#doUpdateCondition').click(function () {

    var conditionToUpdate = {
        id: Ident,
        conditionCar: $("#updateValueCondition").val(),
    }

    $.ajax({
        url: "/condition",
        type: "PUT",
        contentType: "application/json",
        data: JSON.stringify(conditionToUpdate),
        success: function (data) {
            alert("update");
            $("#myModalCondition").modal('hide');


        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});


$("#saveBtnCar").click(function () {

    var carToSave = {
        year: $("#carYear").val(),
        price: $("#carPrice").val(),
        power: $("#carPower").val(),
        milleage: $("#carMilleage").val(),
        brand: $("#carBrand").val(),
        condition: $("#carCondition").val(),
        region: $("#carRegion").val()
    }

    $.ajax({
        url: "/car",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(carToSave),
        success: function (data) {
            alert("Car with name : " + data.brand + " was saved!");
            $("#listOfAllCars").append("<tr><td>" + data.id +
                "</td><td>" + data.year + "</td><td>" + data.price + "</td><td>" +
                +data.power + "</td><td>" + data.milleage + "</td><td>" +
                +data.brand + "</td><td>" + data.condition + "</td><td>" +
                +data.region + "</td><td><button type='button' name='"
                + data.id +
                "' class='deleteBtnCar'>DELETE</button></td><td><button type='button' " +
                "name='" + data.id + "' class='updateBtnCar'>UPDATE</button></td></tr>");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});
$(document).ready(function () {
    $.ajax({
        url: "/cars",
        type: "GET",
        contentType: "application/json",
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
                $("#listOfAllCars").append("<tr>" + data[i].id + "'><td>" + data[i].id +
                    "</td><td>" + data[i].year + "</td><td>" +
                    +data[i].price + "</td><td>" +
                    +data[i].power + "</td><td>" +
                    +data[i].milleage + "</td><td>" +
                    +data[i].brand + "</td><td>" +
                    +data[i].condition + "</td><td>" +
                    +data[i].region + "</td><td><button type='button' class='deleteBtnCar' name='"
                    + data[i].id +
                    "' >DELETE</button></td><td><button type='button' name='"
                    + data[i].id +
                    "' class='updateBtnCar'>UPDATE</button></td></tr>");
            }

            $("#welcomeField").text(localStorage.getItem('currentUser'));
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$(document).on('click', 'button.deleteBtnCar', function () {
    var currentClickedButton = this;
    var idToDelete = currentClickedButton.name;
    console.log(this.name);
    $.ajax({
        url: "/car/" + idToDelete,
        type: "DELETE",
        contentType: "application/json",
        success: function (user) {
            alert("delete");
            $(this).closest('tr').remove();

        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

var Ident;


$(document).on('click', 'button.updateBtnCar', function () {
    $("#myModalCar").modal('show');
    Ident = this.name;
});
// $('#doUpdateCar').click(function () {
//
//     var carToUpdate = {
//         id: Ident,
//         conditionCar: $("#updateValueCondition").val(),
//     }
//
//     $.ajax({
//         url: "/condition",
//         type: "PUT",
//         contentType: "application/json",
//         data: JSON.stringify(conditionToUpdate),
//         success: function (data) {
//             alert("update");
//             $("#myModalCondition").modal('hide');
//
//
//         },
//         error: function (xhr, status, error) {
//             var err = eval("(" + xhr.responseText + ")");
//             alert(err.message);
//         }
//     });
// });
//







