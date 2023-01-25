@echo off
Title Backup Example...

set bckFolder=F:\_BACKUP
 
REM IF EXIST "%bckFolder%\." (  )

echo. > "c:\fsync.log"


cls
echo          **************************************
echo          ***      Backup: Documenti         ***
echo          **************************************
echo.
echo Ricerca dei file modificati su cui eseguire il backup...
md "%bckFolder%\Company"
c:\fsync "D:\Company" "%bckFolder%\Company" /f /d /k /ac /l+
md "%bckFolder%\Users"
c:\fsync "D:\Users" "%bckFolder%\Users" /f /d /k /ac /l+
echo.
md "%bckFolder%\EasyJob"
c:\fsync "D:\EasyJob" "%bckFolder%\EasyJob" /f /d /k /ac /l+
echo.
md "%bckFolder%\SQL Server\Backup"
c:\fsync "D:\SQL Server\Backup" "%bckFolder%\SQL Server\Backup" /f /d /k /ac /l+
echo.
echo.
echo           * Operazione di Backup Completata *
echo.
echo.
MOVE /Y "c:\fsync.log" "%bckFolder%\"
REM pause