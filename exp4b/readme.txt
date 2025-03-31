RUN:
python -m http.server 5500

TEST:
http://localhost:5500/index.html
