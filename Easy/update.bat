@echo off
echo Enter your commit message:
set /p msg=
git add .
git commit -m "%msg%"
git push
python update_readme.py
pause

