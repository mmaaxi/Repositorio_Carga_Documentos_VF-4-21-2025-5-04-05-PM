Feature: Cargar documento con formato no permitido

  Scenario: Verificar error al cargar documento con formato no permitido
    Given el usuario está en la interfaz de usuario con la opción para cargar documentos
    When el usuario selecciona la opción 'Cargar documento'
    Then el formulario para la carga de documentos se muestra

    When el usuario intenta cargar un archivo con formato DOCX
    Then el sistema identifica el formato como no permitido

    When el usuario hace clic en el botón 'Cargar'
    Then el sistema muestra un mensaje de error indicando que el formato del archivo no es permitido