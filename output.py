import numpy as np
tmp_result = df[(df["Name"]=='Tom')&(df["Age"]<30)]
grouped = tmp_result.groupby("Name")
print(grouped.agg({"Age":"min"}))
