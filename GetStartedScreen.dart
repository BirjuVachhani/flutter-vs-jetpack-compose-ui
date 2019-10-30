import 'package:flutter/material.dart';

class GetStartedScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        color: HexColor("#ffd43f"),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Expanded(
              child: Container(
                child: Image.asset(
                  "assets/images/banner.png",
                  fit: BoxFit.fitHeight,
                ),
              ),
            ),
            Container(
              padding: EdgeInsets.all(24.0),
              decoration: BoxDecoration(
                shape: BoxShape.rectangle,
                color: Colors.white,
                borderRadius: BorderRadius.only(
                  topLeft: Radius.circular(16),
                  topRight: Radius.circular(16),
                ),
              ),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: <Widget>[
                  Padding(
                    padding: EdgeInsets.only(top: 16),
                  ),
                  Text(
                    "Welcome to your\nteam calender,\nMargaret!",
                    style: TextStyle(fontSize: 32, fontWeight: FontWeight.bold),
                  ),
                  Padding(
                    padding: const EdgeInsets.symmetric(vertical: 32.0),
                    child: Text(
                      "Here you can see all your meetings and create new ones.",
                      style: TextStyle(color: Colors.black, fontSize: 16),
                    ),
                  ),
                  MaterialButton(
                    height: 48,
                    onPressed: () {},
                    color: HexColor("#6201ee"),
                    textColor: Colors.white,
                    shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(5.0)),
                    child: Text("Get Started"),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

/*
* A Dart Utility class for Using Hex color string in Flutter
* Examples:
* color: HexColor("#ff4433")
* color: HexColor("ff4433")
* color: HexColor("#80ff4433")
* */
class HexColor extends Color {
  HexColor(String hexString) : super(_parseColor(hexString));

  static int _parseColor(String color) {
    try {
      color = color.toUpperCase().replaceAll("#", "");
      if (color.length == 6) {
        color = "FF" + color;
      }
    } on Exception catch (e) {
      return Colors.white.value;
    }
    return int.parse(color, radix: 16);
  }
}
