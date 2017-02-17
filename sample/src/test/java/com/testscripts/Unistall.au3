Run("C:\Windows\System32\control.exe appwiz.cpl")
WinWait("Programs and Features")
WinActivate("Programs and Features")
Send("Google Chrome")
Send("{Enter}")
Sleep(2000)
WinActivate("Uninstall Google Chrome")
Send("{Enter}")

