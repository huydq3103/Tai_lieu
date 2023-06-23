window.ThucVatController = function ($scope, $http) {
  $scope.listSP = [];
  $scope.form_tv = {
    productName: "", // phai phaitrung voi ten thuc the ben model
    price: "",
    url: "",
  };

$scope.vitriCapNHat = -1;
  hienthiData();

  function hienthiData() {
    var apiGet = thucVatAPI + "/hien-thi";
    $http.get(apiGet).then(function (response) {
      console.log(response.data);
      $scope.listSP = response.data;
    });
  }

  // remove
  $scope.deleteThucVat = function (event, index) {
    event.preventDefault();
    let tv = $scope.listSP[index];
    let api = thucVatAPI + "/xoa/" + tv.id;
    $http.delete(api).then(function () {
      alert("xoa thanh cong");
      hienthiData();
    });
  };

  $scope.add = function (event) {
    let api = thucVatAPI + "/add";
    event.preventDefault();
    $http.post(api, JSON.stringify($scope.form_tv)).then(function (response) {
      hienthiData();
    });
  };
  $scope.details = function (event, index) {
    event.preventDefault();
    let sp = $scope.listSP[index];
    $scope.form_tv.productName = sp.productName;
    $scope.form_tv.price = sp.price;
    $scope.form_tv.url = sp.url;
    $scope.vitriCapNHat = index;
    console.log($scope.vitriCapNHat = index)
  };

  $scope.update = function (event) {
    event.preventDefault();
    if ($scope.vitriCapNHat === -1) {
      alert("please choose san pham");
      return;
    }
    let tv = $scope.listSP[$scope.vitriCapNHat];
    let api = thucVatAPI + "/update/" + tv.id;
    $http.put(api, JSON.stringify($scope.form_tv)).then(function (response) {
        hienthiData();
    });
  };


};
// de giao iep giua BE va FE
// => thong qua phuong thuc http
// su dung cac http method GET,POST,PUT,DELETE
// create , read, update, delete

// get : hien thi du lieu ==> read <=> select

// post :
// put :
// delete :
