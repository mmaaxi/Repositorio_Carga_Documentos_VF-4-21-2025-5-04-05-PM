Feature: Validar carga de documentos con distintos tamaños de archivo

  Scenario: Cargar documentos de varios tamaños
    Given el usuario está en la página de carga de documentos
    When selecciona la opción 'Cargar documento'
    Then se despliega el formulario de carga
    
    When el usuario carga un archivo PDF pequeño
    Then el archivo se carga sin problemas
    
    When el usuario carga un archivo PDF grande
    Then el sistema valida el tamaño del archivo
    And informa sobre límites de tamaño o muestra un mensaje adecuado