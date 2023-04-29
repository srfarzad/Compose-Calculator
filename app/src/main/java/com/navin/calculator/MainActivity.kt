package com.navin.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.navin.calculator.components.CalculatorButton
import com.navin.calculator.ui.theme.CalculatorTheme
import com.navin.calculator.ui.theme.LightGray
import com.navin.calculator.ui.theme.MediumGray
import com.navin.calculator.ui.theme.Orange
import com.navin.calculator.util.CalculateAction
import com.navin.calculator.util.CalculatorOperation
import com.navin.calculator.viewModel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
                    .padding(16.dp)){

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {

                        Text(text = state.number1+(state.operation?.symbol ?: "") + state.number2 ,
                        textAlign = TextAlign.End, modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp) ,
                        fontWeight = FontWeight.Light ,
                            fontSize = 80.sp,
                            color = Color.White, maxLines = 2
                        )

                        Row(modifier = Modifier.fillMaxWidth() ,
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {

                            CalculatorButton(symbol = "AC",
                            color = LightGray , modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)) {


                                viewModel.onAction(CalculateAction.Clear)

                                //click

                            }

                            CalculatorButton(symbol = "Del",
                                color = LightGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {


                                viewModel.onAction(CalculateAction.Delete)

                                //click

                            }
                            CalculatorButton(symbol = "/",
                                color = Orange , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {


                                viewModel.onAction(CalculateAction.Operation(CalculatorOperation.Divide))

                                //click

                            }


                        }

                        Row(modifier = Modifier.fillMaxWidth() ,
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {

                            CalculatorButton(symbol = "7",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {


                                viewModel.onAction(CalculateAction.Number(7))

                                //click

                            }

                            CalculatorButton(symbol = "8",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {

                                viewModel.onAction(CalculateAction.Number(8))

                                //click

                            }
                            CalculatorButton(symbol = "9",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(9))
                                //click

                            }

                            CalculatorButton(symbol = "X",
                                color = Orange , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {

                                viewModel.onAction(CalculateAction.Operation(CalculatorOperation.Multiply))

                                //click

                            }


                        }


                        Row(modifier = Modifier.fillMaxWidth() ,
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {

                            CalculatorButton(symbol = "4",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(4))
                                //click

                            }

                            CalculatorButton(symbol = "5",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(5))
                                //click

                            }
                            CalculatorButton(symbol = "6",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(6))
                                //click

                            }

                            CalculatorButton(symbol = "-",
                                color = Orange , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Operation(CalculatorOperation.Minus))
                                //click

                            }


                        }


                        Row(modifier = Modifier.fillMaxWidth() ,
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {

                            CalculatorButton(symbol = "1",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(1))
                                //click

                            }

                            CalculatorButton(symbol = "2",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(2))
                                //click

                            }
                            CalculatorButton(symbol = "3",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                viewModel.onAction(CalculateAction.Number(3))
                                //click

                            }

                            CalculatorButton(symbol = "+",
                                color = Orange , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {
                                            viewModel.onAction(CalculateAction.Operation(CalculatorOperation.Add))
                                //click

                            }


                        }


                        Row(modifier = Modifier.fillMaxWidth() ,
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {

                            CalculatorButton(symbol = "0",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)) {
                                viewModel.onAction(CalculateAction.Number(0))
                                //click

                            }

                            CalculatorButton(symbol = ".",
                                color = MediumGray , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {

                                viewModel.onAction(CalculateAction.Decimal)

                                //click

                            }
                            CalculatorButton(symbol = "=",
                                color = Orange , modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)) {

                                viewModel.onAction(CalculateAction.Calculate)

                                //click

                            }




                        }

                    }


                }


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        Greeting("Android")
    }
}