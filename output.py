import numpy as np
df["additional_col1"] = np.nan
df["additional_col2"] = np.nan
del df["additional_col2"]
print('General query coming soon!')df.loc[df.Name=='Tom',"additional_col1"]='Thomas'
