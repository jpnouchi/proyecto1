CREATE PROCEDURE sp_ebiz_update_state_sapdocprovision 
				 @id INT,
				 @tabla varchar(50),
                 @estado varchar(2)
                  
AS
BEGIN
DECLARE @UpdateString NVARCHAR(500)

-- Build the INSERT statement.
SET @UpdateString = 
'UPDATE '+@tabla+
' SET ESTADO= @UpdateEstado'+
' WHERE IDSAPDOC_PROVISION=@UpdateId'

SET @ParmDefinition = N'@UpdateEstado VARCHAR(2), @UpdateId INT'

EXEC sp_executesql @UpdateString,
     ,
     @estado, @id
END	 
GO

exec sp_ebiz_update_state_sapdocprovision 1,'PRUEBA_SAP','b'

select * from dbo.PRUEBA_SAP