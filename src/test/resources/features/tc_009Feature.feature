Feature: Permisos y seguridad en la carga de documentos

  Scenario: Validar permisos y seguridad en la carga de documentos
    Given el usuario está en la página de inicio de sesión
    When inicia sesión con un usuario sin permisos para cargar documentos
    Then el sistema restringe el acceso a la función de carga

    When el usuario intenta acceder a la funcionalidad de carga de documentos
    Then se muestra un mensaje de acceso denegado o redirección a la página de permisos