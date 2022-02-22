import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

source = r'CRPPL/CSV Files/source/1000 - Emp Leaves.csv'
target = r'CRPPL/CSV Files/target/emps.csv'
shutil.copyfile(source,target)
emp = pd.read_csv('CRPPL/CSV Files/target/emps.csv')

# i am checking line
tmp_result = emp[["Leave"]]
grouped = emp
print(grouped.agg({"Leave":"sum"}))
# i am checking line
