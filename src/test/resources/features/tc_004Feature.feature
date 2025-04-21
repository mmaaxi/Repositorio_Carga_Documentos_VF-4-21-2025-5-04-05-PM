Feature: Validar metadatos de documento cargado

  Scenario: Verificar validación de metadatos en el documento cargado
    Given el usuario carga un documento PDF con metadatos completos e incorrectos
    When el sistema procesa los metadatos del documento
    Then el sistema resalta inconsistencias o errores en los metadatos, solicitando corrección