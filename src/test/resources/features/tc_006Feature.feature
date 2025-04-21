Feature: Verificar reinicio del proceso de carga tras error de conexión

  Scenario: Reinicio del proceso de carga de un documento PDF tras error de conexión
    Given el usuario está en la página de carga de documentos
    When inicia la carga de un documento PDF
    Then el sistema comienza el proceso de carga
    When la conexión a internet es interrumpida durante la carga
    Then el proceso de carga se detiene y se muestra un mensaje de error de conexión
    When la conexión a internet es restablecida e intenta cargar nuevamente
    Then el sistema permite reintentar la carga exitosamente