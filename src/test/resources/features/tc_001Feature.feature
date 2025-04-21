Feature: Validar carga de documento con formato PDF válido

Scenario: Carga de documento PDF válido
  Given El usuario está en la página de carga de documentos
  When El usuario selecciona la opción 'Cargar documento'
  Then Se despliega el formulario para la carga de documentos

  When El usuario selecciona un archivo PDF válido desde el sistema de archivos
  Then El archivo seleccionado es reconocido como PDF

  When El usuario hace clic en el botón 'Cargar'
  Then El sistema inicia el proceso de carga y muestra una barra de progreso

  And El documento se almacena correctamente en la base de datos
  Then El documento se almacena y se asigna un identificador único