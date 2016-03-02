 'use strict';

angular.module('jhipstersimpleappApp')
    .factory('notificationInterceptor', function ($q, AlertService) {
        return {
            response: function(response) {
                var alertKey = response.headers('X-jhipstersimpleappApp-alert');
                if (angular.isString(alertKey)) {
                    AlertService.success(alertKey, { param : response.headers('X-jhipstersimpleappApp-params')});
                }
                return response;
            }
        };
    });
