#!/bin/bash

#script che crea una pagina HTML con info sul sistema

## COSTANTI
title="Informazioni sul sistema per $HOSTNAME"
adesso=$(date +"%x %r %Z")
timbro_data="Aggiornata a $adesso da $USER" 

## FUNZIONI
function info_sistema
{
    echo "<H2> info_sistema </H2>" 
}

function mostra_uptime
{
    echo "<H2> Uptime del sistema </H2>"
    echo "<pre>"
    uptime
    echo "</pre>"
}

function spazio_disco
{
    echo "<H2> Spazio Sistema </H2>"
    echo "<pre>"
    df -h
    echo "</pre>"
}

function spazio_home
{
    echo "<H2> Spazio home per utente </H2>"
    echo "<pre>"
    echo "Byte    Directory"
    du -sh /Users/simone
    echo "</pre>"
}

function mostra_info
{
    echo "<H2> mostra_info </H2>"
}

##
##  SCRIPT PRINCIPALE
##
cat <<- _EOF_
<HTML>
<HEAD>
    <TITLE> $title </TITLE>
</HEAD>

<BODY>
    <H1> $title </H1>
    <i>
        <ul>
            <li> Utente: $USER </li>
            <li> Shell utilizzata: $SHELL </li>
            <li> OS utilizzato: $OSTYPE </li>
        </ul>
    </i>
    <P> $timbro_data </P>
    <P> ---------------------- </P>
    $(info_sistema)
    $(mostra_uptime)
    $(spazio_disco)
    $(spazio_home)
    $(mostra_info)
</BODY>

</HTML>

_EOF_