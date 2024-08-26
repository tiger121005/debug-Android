# デバッグチェックワーク

## ゴール

1. エラーを解決し、アプリを起動すること
2. バグを解決し、キャプチャ通りの挙動を再現すること

## 進め方

1. `MainActivity.kt` に書かれた問題に基づいてデバッグする。
2. 問題が終わったら、 `submit` ディレクトリに、 `app/src` ディレクトリのコピー `src-問題番号` を作成する。
<img width="512" alt="copy" src="https://user-images.githubusercontent.com/49048577/153718861-251d6e16-acbc-4cba-9eda-0016593a6e50.png">


3. コピーしたら、次の問題を表示するGradleのタスクを実行する。（ダブルクリックで実行！）
<img width="512" alt="tasks" src="https://user-images.githubusercontent.com/49048577/153718864-84ff8b7e-a57e-4bad-90df-f0d55e268b48.png">

もし、タスクが見つからなかったらメニューバー(画面上部)の
Android Studio > Settings
を開き、ExperimentalのConfigure all Gradle tasks ...にチェックを入れ、
File > Sync Project with Gradle fileを実行する

<img width="512" alt="settings" src="https://github.com/lifeistech/android-la-count-debug-checkwork/assets/63948210/6ce8093f-17c0-4990-922e-7ff37618a7ae">

<img width="512" alt="Sync Gradle" src="https://github.com/lifeistech/android-la-count-debug-checkwork/assets/63948210/ac7cc35d-a9a7-45b3-893e-0fba3620841d">



4. Gradleのタスクを実行すると、 `app/src` ディレクトリが次の問題に置き換わるので、問題を解く。
5. 1~4を繰り返し、順番に問題を解いていく。（飛ばしてもOK！）
