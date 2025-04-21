Feature: Validar visualización y confirmación de carga exitosa

  Scenario: Cargar un documento PDF y verificar carga exitosa
    Given El usuario está en la página de carga de documentos
    When El usuario carga un documento PDF válido
    Then El sistema procesa la carga del documento
    And El usuario recibe una notificación de confirmación de carga exitosa
    And El documento aparece en la lista de documentos cargados