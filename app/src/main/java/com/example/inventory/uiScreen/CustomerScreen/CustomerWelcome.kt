package com.example.restaurantapp.uiScreen.CustomerScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.inventory.DatabaseViewModel
import com.example.inventory.uiScreen.CustomerScreen.CustomerViewModel

@Composable
fun CustomerWelcome(
    modifier: Modifier,
    OnStartOrderClicked: () -> Unit,
    customerViewModel: CustomerViewModel,
    databaseViewModel: DatabaseViewModel,
) {
    val uiState by customerViewModel.uiState.collectAsState()
    val tableNumber = uiState.currentTableNumber
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Your table is $tableNumber")
        Button(
            onClick = OnStartOrderClicked,
            modifier = Modifier.padding(10.dp)
        ) { Text("Start your order") }
    }

}