import numpy as np
df["additional_col1"] = np.nan
df["additional_col2"] = np.nan
del df["additional_col2"]
tmp_result = df[df["Age"]<20]
print(tmp_result[["Name","Age"]])
print(df[["Name","Age"]])
df.loc[df.Name=='Tom',"additional_col1"]='Thomas'
