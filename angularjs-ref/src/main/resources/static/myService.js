app.service('myService', function($http) {
    this.getItems = function() {
        // console.log($http.get('http://localhost:9092/books/'));
        return $http.get('http://localhost:9092/books/');
    };

    this.addItem = function(item) {
        return $http.post('http://localhost:9092/books/create', item);
    };

    this.updateItem = function(item) {
        return $http.put('http://localhost:9092/books/update/' + item.id, item);
    };

    this.deleteItem = function(item) {
        return $http.delete('http://localhost:9092/books/delete/' + item.id);
    };
    
});