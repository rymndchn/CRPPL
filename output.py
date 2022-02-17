import numpy as np
df["additional_col1"] = np.nan
df["additional_col2"] = np.nan
del df["additional_col2"]
<<<<<<< HEAD
tmp_result = df[df["Age"]<20]
print(tmp_result[["Name","Age"]])
print(df[["Name","Age"]])
=======
print('General query coming soon!')
>>>>>>> origin/master
df.loc[df.Name=='Tom',"additional_col1"]='Thomas'
