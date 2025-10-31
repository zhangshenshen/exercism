#!/usr/bin/env bash
str=$1
len=${#str}  # 获取字符串长度
reversed=""
for ((i=len-1; i>=0; i--)); do
  reversed+=${str:i:1}  # 截取第 i 个字符，追加到 reversed
done
echo "$reversed" # 输出：olleh