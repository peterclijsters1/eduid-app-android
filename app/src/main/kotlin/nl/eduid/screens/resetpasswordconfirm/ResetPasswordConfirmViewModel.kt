package nl.eduid.screens.resetpasswordconfirm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import nl.eduid.di.model.UserDetails
import nl.eduid.graphs.Account
import nl.eduid.graphs.ResetPasswordConfirm
import nl.eduid.screens.personalinfo.PersonalInfoRepository
import javax.inject.Inject

@HiltViewModel
class ResetPasswordConfirmViewModel @Inject constructor(
    private val repository: PersonalInfoRepository,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val passwordHash: String

    init {
        passwordHash = savedStateHandle.get<String>(ResetPasswordConfirm.passwordHashArg)
            ?: ""
    }

    val newPasswordInput = MutableLiveData("")
    val confirmPasswordInput = MutableLiveData("")

    fun onNewPasswordInput(newValue: String) {
        newPasswordInput.value = newValue
    }

    fun onConfirmPasswordInput(newValue: String) {
        confirmPasswordInput.value = newValue
    }


    fun onResetPasswordClicked() {
        if (newPasswordInput.value == confirmPasswordInput.value && newPasswordInput.value?.isNotBlank() == true) {

        }
    }

    fun onDeletePasswordClicked() {

    }
}