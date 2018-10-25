from flask import Flask, render__template

app = Flask(__name__)

@app.route("/")
def index():
    return render__template("index.html")


    if __name__ == "__main__":
        app.run(debug=True)