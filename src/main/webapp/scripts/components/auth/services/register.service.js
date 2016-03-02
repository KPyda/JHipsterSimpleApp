'use strict';

angular.module('jhipstersimpleappApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


