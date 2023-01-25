net use f: \\Server2k3\Archivio
net use i: \\Server2k3\Archivio
net use j: \\server2k3\g /YES

rem * ------------ 04.04.2014 
net use q: /DELETE
net use r: /DELETE
net use q: \\Server2k3-arc\zetafax
net use r: \\Server2k3-arc\arcfax

rem * ------------ 04.04.2014 
rem net use q: /DELETE
rem net use q: \\Server2k3\archivio


rem 26.02.2014 - net use t: \\nas-233\backup /y

rem ** \\SERVER2K3\sysvol\newcharter.local\scripts\SBS_LOGIN_SCRIPT.bat
rem md c:\newcharter
rem copy f:\nc_db\fe_db\newcharter.mdb c:\newcharter /y
rem md c:\nc_db
rem xcopy f:\nc_db\nc_db c:\nc_db /s /y 