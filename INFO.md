# INFORMACION
## Vincular git y github
### Configurar el correo para que sea el mismo que en github
```bash
git config --global user.email "TuCorreo"
```
### Vincular repositorio local con el de github
```bash
git remote add origin https://github.com/V0lms/TareaENDE.git  
```
## Subir usando git
### COMMIT (Es lo de siempre)
Crear un directorio donde estaran los archivos y hacer el comando 
```bash
  git init
```
Añadir los archivos/cambios al repositorio local
```bash
git add .
```
Hacer el comit  con un texto indicando vuesto nombre y los cambios que habeis realizado(En caso de)
```bash
git commit -m "NOMBRE, CAMBIOS"
```

### PUSH
```bash
git push https://github.com/V0lms/TareaENDE/[NombreTarea] develop
```

```bash
git request-pull https://github.com/V0lms/TareaENDE/[NombreTarea] develop
```
