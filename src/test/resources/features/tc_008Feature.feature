Feature: Gestión de archivos duplicados

  Scenario: Evaluar gestión de archivos duplicados
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF válido por primera vez
    Then el archivo se carga correctamente
    When el usuario intenta cargar el mismo documento PDF nuevamente
    Then el sistema detecta el duplicado y muestra un mensaje informativo