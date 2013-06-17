CREATE TABLE MONITOR.CONTROL ( IDCONTROL INTEGER  NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE )  , FLAGPROCESO SMALLINT  NOT NULL , TIPO VARCHAR (5)  NOT NULL , FECHAREGISTRO TIMESTAMP  WITH DEFAULT 'CURRENT TIMESTAMP' , MENSAJE VARCHAR (1024)  , CONSTRAINT CC1371500375465 PRIMARY KEY ( IDCONTROL)  ) IN TS_MONITOR PARTITION BY RANGE(IDCONTROL) (STARTING FROM (MINVALUE) ENDING AT (MAXVALUE) EVERY (1000) )
DB21034E  El mandato se ha procesado como una sentencia de SQL porque no era 
un mandato válido para el procesador de línea de mandatos.  Durante el proceso 
SQL se ha devuelto:
SQL8027N  Se está utilizando el particionamiento de tablas sin tener una 
licencia de DB2 Enterprise Server Edition.  DB2 ha detectado que la función de 
particionamiento de tablas se está utilizando sin una licencia de DB2 
Enterprise Server Edition.  Asegúrese de que haya adquirido titularidades de 
DB2 Enterprise Server Edition válidos del representante de IBM o del 
concesionario autorizado y de que haya actualizado la licencia utilizando el 
Centro de licencias de DB2 o el programa de utilidad de línea de mandatos 
db2licm. Para obtener más información sobre cómo actualizar licencias, 
consulte la Guía rápida de iniciación que se corresponda con su plataforma. 
Para obtener más información sobre el programa de utilidad db2licm, consulte 
el manual DB2 Consulta de mandatos.

CONNECT RESET
DB20000I  El mandato SQL ha finalizado satisfactoriamente.