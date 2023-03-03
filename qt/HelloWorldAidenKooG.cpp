#include "mainwindow.h"
#include <QApplication>

#include <QLabel>
#include <QDebug>

int main(int argc, char *argv[])
{
  QApplication qApp(argc, argv);

  qDebug() << "Hello World! AidenKooG!";

  QLabel qLabel("<b>Hello World! AidenKooG!</b>");
  aLabel.show();

  return qApp.exec();
}