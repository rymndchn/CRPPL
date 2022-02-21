import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

df["additional_col1"] = np.nan
df.to_csv('CRPPL/CSV Files/target/df.csv', index=False)
df["additional_col2"] = np.nan
df.to_csv('CRPPL/CSV Files/target/df.csv', index=False)
df.drop('additional_col2',axis=1, inplace=True)
df.to_csv('CRPPL/CSV Files/target/df.csv', index=False)
df.loc[df.Name=='Tom',"additional_col1"]='Thomas'
def do_graph_in(df):
	tmp_result = df[df["Age"]<20]
	print(tmp_result[["Name","Age"]])
	num = 3+1
	tmp_result = df[df["Age"]<15]
	print(tmp_result[["Name","Age"]])

def do_graph_inside(revenue):
	graph_name = 'x'
	tmp_result = df[df["Age"]<20]
	print(tmp_result[["Name","Age"]])
	return graph_name

counter = 0
count_max = 3
def add_num(counter, count_max):
	if ( counter < count_max ) :
				tmp_result = df[df["Age"]<20]
		print(tmp_result[["Name","Age"]])
	else:
				counter = counter+1
				add_num(counter, count_max)

#end if

do_graph_in(df)
