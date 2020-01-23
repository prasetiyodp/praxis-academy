1. creates a new project and hosts it on GitHub.

# Create a folder for your project.
depe@depe:~$ mkdir rhymes
depe@depe:~$ cd rhymes
depe@depe:~/rhymes$ 

# To make this directory and empty Git repo do this:
depe@depe:~/rhymes$ git init
Initialized empty Git repository in /home/depe/rhymes/.git/

depe@depe:~/rhymes$ touch README.txt
depe@depe:~/rhymes$ git add README.txt
depe@depe:~/rhymes$ git commit -m 'First commit.'
[master (root-commit) b732fb8] First commit.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt

depe@depe:~/rhymes$ echo 'This repo is a collection of my favorite nursery rhymes.' >> README.txt
depe@depe:~/rhymes$ 

# Review uncommitted changes. Then commit them.
depe@depe:~/rhymes$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.txt

no changes added to commit (use "git add" and/or "git commit -a")


depe@depe:~/rhymes$ git diff
diff --git a/README.txt b/README.txt
index e69de29..c83e022 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursery rhymes.

depe@depe:~/rhymes$ git commit -m 'Added project overview to README.txt'
[master f5b726f] Added project overview to README.txt
 1 file changed, 1 insertion(+)

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/all-around-the-mulberry-bush.txt
--2020-01-15 17:40:01--  https://www.acquia.com/sites/default/files/blog/all-around-the-mulberry-bush.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:40:03 ERROR 404: Not Found.

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/jack-and-jill.txt
--2020-01-15 17:40:22--  https://www.acquia.com/sites/default/files/blog/jack-and-jill.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:40:24 ERROR 404: Not Found.

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/old-mother-hubbard.txt
--2020-01-15 17:40:32--  https://www.acquia.com/sites/default/files/blog/old-mother-hubbard.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:40:33 ERROR 404: Not Found.

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/twinkle-twinkle.txt
--2020-01-15 17:40:40--  https://www.acquia.com/sites/default/files/blog/twinkle-twinkle.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:40:42 ERROR 404: Not Found.

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt 
--2020-01-15 17:40:51--  https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:40:52 ERROR 404: Not Found.

depe@depe:~/rhymes$ 

depe@depe:~/rhymes$ git remote add origin https://github.com/prasetiyodp/rhymes.git
depe@depe:~/rhymes$ git push -u origin master 
Username for 'https://github.com': prasetiyodp	
Password for 'https://prasetiyodp@github.com': 
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 512 bytes | 512.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To https://github.com/prasetiyodp/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

2. copies Alice's project, then submits some simple changes

depe@depe:~/rhymes$ git clone https://github.com/prasetiyodp/rhymes.git
Cloning into 'rhymes'...
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 6 (delta 0), reused 6 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), done.


depe@depe:~/rhymes$ git checkout -b hickory-dickory
Switched to a new branch 'hickory-dickory'


depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...
--2020-01-15 17:51:19--  https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:51:22 ERROR 404: Not Found.

depe@depe:~/rhymes$ wget https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...add hickory-dickory-dock.txt
--2020-01-15 17:52:06--  https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...add
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... 
connected.
HTTP request sent, awaiting response... 404 Not Found
2020-01-15 17:52:08 ERROR 404: Not Found.

--2020-01-15 17:52:08--  http://hickory-dickory-dock.txt/
Resolving hickory-dickory-dock.txt (hickory-dickory-dock.txt)... 36.86.63.182
Connecting to hickory-dickory-dock.txt (hickory-dickory-dock.txt)|36.86.63.182|:80... connected.
HTTP request sent, awaiting response... 302 Found
Location: http://mercusuar.uzone.id [following]
--2020-01-15 17:52:08--  http://mercusuar.uzone.id/
Resolving mercusuar.uzone.id (mercusuar.uzone.id)... 36.86.63.180
Connecting to mercusuar.uzone.id (mercusuar.uzone.id)|36.86.63.180|:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘index.html’

index.html              [  <=>               ]  49,08K   227KB/s    in 0,2s    

2020-01-15 17:52:09 (227 KB/s) - ‘index.html’ saved [50257]

FINISHED --2020-01-15 17:52:09--
Total wall clock time: 2,7s
Downloaded: 1 files, 49K in 0,2s (227 KB/s)


depe@depe:~/rhymes$ git push origin hickory-dickory
Username for 'https://github.com': prasetiyodp
Password for 'https://prasetiyodp@github.com': 
Total 0 (delta 0), reused 0 (delta 0)
remote: 
remote: Create a pull request for 'hickory-dickory' on GitHub by visiting:
remote:      https://github.com/prasetiyodp/rhymes/pull/new/hickory-dickory
remote: 
To https://github.com/prasetiyodp/rhymes.git
 * [new branch]      hickory-dickory -> hickory-dickory


3. reviews and accepts Bob's simple changes
depe@depe:~/rhymes$ cd rhymes
depe@depe:~/rhymes/rhymes$ ls
README.txt
depe@depe:~/rhymes/rhymes$ git remote rename origin alice

depe@depe:~/rhymes/rhymes$ git remote add bob https://github.com/prasetiyodp/rhymes.git
depe@depe:~/rhymes/rhymes$ git remote
alice
bob
depe@depe:~/rhymes/rhymes$ git remote -v
alice	https://github.com/prasetiyodp/rhymes.git (fetch)
alice	https://github.com/prasetiyodp/rhymes.git (push)
bob	https://github.com/prasetiyodp/rhymes.git (fetch)
bob	https://github.com/prasetiyodp/rhymes.git (push)

depe@depe:~/rhymes/rhymes$ git fetch bob
From https://github.com/prasetiyodp/rhymes
 * [new branch]      hickory-dickory -> bob/hickory-dickory
 * [new branch]      master          -> bob/master
depe@depe:~/rhymes/rhymes$ git branch -a
* master
  remotes/alice/HEAD -> alice/master
  remotes/alice/master
  remotes/bob/hickory-dickory
  remotes/bob/master
depe@depe:~/rhymes/rhymes$ git checkout -b hickory-dickory bob/hickory-dickory
Branch 'hickory-dickory' set up to track remote branch 'hickory-dickory' from 'bob'.
Switched to a new branch 'hickory-dickory'
depe@depe:~/rhymes/rhymes$ git diff master hickory-dickory
depe@depe:~/rhymes/rhymes$ git log -1 -p
commit f5b726f8980dd88cf1ab62aab830a372be796c76 (HEAD -> hickory-dickory, bob/master, bob/hickory-dickory, alice/master, alice/HEAD, master)
Author: Dwi Prasetiyo <prasetiyodp@gmail.com>
Date:   Wed Jan 15 17:39:08 2020 +0700

    Added project overview to README.txt

diff --git a/README.txt b/README.txt
index e69de29..c83e022 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursery rhymes.
depe@depe:~/rhymes/rhymes$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'alice/master'.
depe@depe:~/rhymes/rhymes$ git merge hickory-dickory
Already up to date.
depe@depe:~/rhymes/rhymes$ git branch -D hickory-dickory
Deleted branch hickory-dickory (was f5b726f).

4. makes lots of changes
depe@depe:~/rhymes/rhymes$ git remote add alice https://github.com/bryanhirsch/rhymes.git
fatal: remote alice already exists.
depe@depe:~/rhymes/rhymes$ git remote
alice
bob
depe@depe:~/rhymes/rhymes$ git remote -v
alice	https://github.com/prasetiyodp/rhymes.git (fetch)
alice	https://github.com/prasetiyodp/rhymes.git (push)
bob	https://github.com/prasetiyodp/rhymes.git (fetch)
bob	https://github.com/prasetiyodp/rhymes.git (push)
depe@depe:~/rhymes/rhymes$ git remote -v
alice	https://github.com/prasetiyodp/rhymes.git (fetch)
alice	https://github.com/prasetiyodp/rhymes.git (push)
bob	https://github.com/prasetiyodp/rhymes.git (fetch)
bob	https://github.com/prasetiyodp/rhymes.git (push)
depe@depe:~/rhymes/rhymes$ git remote update 
Fetching alice
From https://github.com/prasetiyodp/rhymes
 * [new branch]      hickory-dickory -> alice/hickory-dickory
Fetching bob
depe@depe:~/rhymes/rhymes$ git checkout master 
Already on 'master'
Your branch is up to date with 'alice/master'.
depe@depe:~/rhymes/rhymes$ git merge alice/master 
Already up to date.
depe@depe:~/rhymes/rhymes$ git diff alice/master 
depe@depe:~/rhymes/rhymes$ git push bob master 
Username for 'https://github.com': prasetiyodp
Password for 'https://prasetiyodp@github.com': 
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/prasetiyodp/rhymes.git/'

epe@depe:~/rhymes/rhymes$ git checkout -b bobs-changes
Switched to a new branch 'bobs-changes'

Link berrikut tidak aktif, jadi proses menjalankan perintah terhambat
wget https://www.acquia.com/sites/default/files/blog/all-around-the-mulberry-bush.txt
wget https://www.acquia.com/sites/default/files/blog/jack-and-jill.txt
wget https://www.acquia.com/sites/default/files/blog/old-mother-hubbard.txt
wget https://www.acquia.com/sites/default/files/blog/twinkle-twinkle.txt
wget https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt 

