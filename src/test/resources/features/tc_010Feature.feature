Feature: Eliminar Documentos Cargados

  Scenario: Validar el proceso de eliminación de documentos cargados
    Given El usuario ha iniciado sesión en el sistema
    When Selecciona un documento previamente cargado
    Then El sistema muestra la opción de eliminación
    When Hace clic en 'Eliminar documento' y confirma la acción
    Then El sistema elimina el documento de la lista y de la base de datos, mostrando un mensaje de confirmación