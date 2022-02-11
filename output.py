import numpy as np
df["additional_col"] = np.nan
df[col1] = np.nan
exec(tbl+'["additional_col3"] = np.nan')
exec(tbl+'["'+col+'"] = np.nan')
del df["additional_col"]
exec( 'del ' + tbl+'["'+col+'"]')
del df[col1]
exec( 'del ' + tbl+'["additional_col3"]')
