	CREATE PROCEDURE sp_ebiz_select_prueba
				 @id INT,
				 @tabla varchar(50)
                  
AS
BEGIN
DECLARE @SelectString NVARCHAR(max)
DECLARE @ParmDefinition NVARCHAR(max)

SET @SelectString = 
'SELECT IDSAPDOC_PROVISION , ESTADO '+@tabla+
' WHERE IDSAPDOC_PROVISION=@SelectId'

SET @ParmDefinition =N'@SelectId INT'

EXEC sp_executesql @SelectString,
     @ParmDefinition,
     @id
	 	 
END	 




|